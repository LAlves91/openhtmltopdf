/*
 * {{{ header & license
 * Copyright (c) 2004, 2005 Joshua Marinacci
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public License
 * as published by the Free Software Foundation; either version 2.1
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.	See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA 02111-1307, USA.
 * }}}
 */
package org.xhtmlrenderer.css.value;


/**
 * Description of the Class
 *
 * @author Patrick Wright
 */
public class Border {

    /**
     * Description of the Field
     */
    public int top;

    /**
     * Description of the Field
     */
    public int bottom;

    /**
     * Description of the Field
     */
    public int left;

    /**
     * Description of the Field
     */
    public int right;

    /**
     * Constructor for the Border object
     */
    public Border() {
    }

    /**
     * Copy constructor for the Border object. Creates a copy of the Border
     * object parameter
     *
     * @param bd Object to copy.
     */
    public Border(Border bd) {
        this.top = bd.top;
        this.bottom = bd.bottom;
        this.left = bd.left;
        this.right = bd.right;
    }

    /**
     * Constructor for the Border object
     *
     * @param top    PARAM
     * @param right  PARAM
     * @param bottom PARAM
     * @param left   PARAM
     */
    public Border(int top, int right, int bottom, int left) {
        this.top = top;
        this.bottom = bottom;
        this.right = right;
        this.left = left;
    }


    /**
     * Converts to a String representation of the object.
     *
     * @return A string representation of the object.
     */
    public String toString() {

        return "Border: top = " + top + " right = " + right + " bottom = " + bottom + " left = " + left;
    }

    //CHECK: this is never used
    public static final Border EMPTY_BORDER = new Border(0, 0, 0, 0);
}

/*
 * $Id$
 *
 * $Log$
 * Revision 1.1  2005/06/22 23:48:42  tobega
 * Refactored the css package to allow a clean separation from the core.
 *
 * Revision 1.7  2005/06/16 07:24:47  tobega
 * Fixed background image bug.
 * Caching images in browser.
 * Enhanced LinkListener.
 * Some house-cleaning, playing with Idea's code inspection utility.
 *
 * Revision 1.6  2005/04/19 13:59:29  pdoubleya
 * Added EMPTY_BORDER for defaults.
 *
 * Revision 1.5  2005/01/29 20:24:26  pdoubleya
 * Clean/reformat code. Removed commented blocks, checked copyright.
 *
 * Revision 1.4  2004/11/09 15:53:48  joshy
 * initial support for hover (currently disabled)
 * moved justification code into it's own class in a new subpackage for inline
 * layout (because it's so blooming complicated)
 *
 * Issue number:
 * Obtained from:
 * Submitted by:
 * Reviewed by:
 *
 * Revision 1.3  2004/11/02 17:13:59  joshy
 * implemented double borders
 *
 *
 * Issue number:
 * Obtained from:
 * Submitted by:
 * Reviewed by:
 *
 * Revision 1.2  2004/10/23 13:03:44  pdoubleya
 * Re-formatted using JavaStyle tool.
 * Cleaned imports to resolve wildcards except for common packages (java.io, java.util, etc)
 * Added CVS log comments at bottom.
 *
 *
 */
