/**
 * Test class for SegmentNode. 
 * 
 * @author Brodee Clontz, Collin Riddle, Kyler Bailey
 * @date 01/25/24
 */

package input.components.segment;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

import input.components.point.PointNode;

class SegmentNodeTest { 

	/**
	 * Test that a SegmentNode is properly constructed by taking to points
	 */
	@Test
	void testConstructSegmentNode() {

		PointNode point1 = new PointNode("kyler", 3, 3);
		PointNode point2 = new PointNode("Brodee", 2, 2);

		SegmentNode segment = new SegmentNode(point1, point2);

		assertEquals("Points not the same", segment.getPoint1(), point1);
		assertEquals("Points not the same", segment.getPoint2(), point2);

	}

	/**
	 * Test to see if the two segments are same and if the object is a valid segment
	 */
	@Test
	void testbooleanEquals() {

		PointNode point1 = new PointNode("one", 1, 1);
		PointNode point2 = new PointNode("two", 2, 2);

		SegmentNode segment1 = new SegmentNode(point1, point2);
		SegmentNode segment2 = new SegmentNode(point1, point2);

		assertTrue("Segments not the same", segment1.equals(segment2));

		segment2 = new SegmentNode(point2, point1);

		assertTrue("Segments not the same", segment1.equals(segment2));

	}

	/**
	 * Test that the string will append both PointNodes and return that given
	 * segment
	 */
	@Test
	void testToString() {

		PointNode p1 = new PointNode("A", 0, 0);
		PointNode p2 = new PointNode("", 1, 0);
		PointNode p3 = new PointNode(1, 1);
		PointNode p4 = new PointNode("0", 4, 2);

		SegmentNode segment1 = new SegmentNode(p1, p2);
		SegmentNode segment2 = new SegmentNode(p3, p4);

		//assertEquals("{A,}", segment1.toString());
		//assertEquals("{__UNNAMED,0}", segment2.toString());

	}

}
