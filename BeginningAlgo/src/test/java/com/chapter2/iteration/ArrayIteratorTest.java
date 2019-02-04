package com.chapter2.iteration;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.chapter2.iteration.ArrayIterator;

public class ArrayIteratorTest {

	@Test
	public void testIterationRespectsBounds() {
		Object[] array = new Object[] {"A", "B", "C"};
		ArrayIterator iterator = new ArrayIterator(array);
		iterator.last();
		assertFalse(iterator.isDone());
		assertSame(array[2], iterator.current());
		iterator.previous();
		assertFalse(iterator.isDone());
		assertSame(array[1], iterator.current());
		iterator.previous();
		assertFalse(iterator.isDone());
		assertSame(array[0], iterator.current());
		iterator.previous();
		assertTrue(iterator.isDone());
		try {
			iterator.current();
		} catch (IteratorOutOfBoundsException e) {
		
		}
		
	}
	
}
