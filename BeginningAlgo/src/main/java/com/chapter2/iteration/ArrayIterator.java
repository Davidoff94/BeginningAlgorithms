package com.chapter2.iteration;
import com.chapter2.iteration.Iterator;

class ArrayIterator implements Iterator {

	private final Object[] _array;
	private final int _start = 0;
	private final int _end = 0;
	private int _current = -1;
	private int _last;
	private int _first ;
	
	public ArrayIterator(Object[] array) {
		assert array != null : "array can’t be null";
		_array = array;
		_first = 0;
		_last = array.length - 1;
	}
	
	public ArrayIterator(Object[] array, int start, int length) {
		assert array != null : "array can’t be null";
		assert start >= 0 : "start can’t be < 0";
		assert start < array.length : "start can’t be > array.length";
		assert length >= 0 : "length can’t be < 0";
		_array = array;
		_first = start;
		_last = start + length - 1;
		
		assert _last < array.length : "start + length can’t be > array.length";
	}
	
	@Override
	public void first() {
		_current = _first;
		
	}

	@Override
	public void last() {
		_current = _last;
		
	}

	@Override
	public boolean isDone() {
		return _current < _first || _current > _last;
	}

	@Override
	public void next() {
		++_current;
		
	}

	@Override
	public void previous() {
		--_current;
		
	}
	
	public Object current() throws IteratorOutOfBoundsException {
		if (isDone()) {
			throw new IteratorOutOfBoundsException();
		}
		
		return _array[_current];
	}

	
	
	
}
