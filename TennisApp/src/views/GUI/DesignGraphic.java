/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package views.GUI;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Carlos
 */
public class DesignGraphic {
    
     public DesignGraphic(Point pPoint, int r, Color pColor, Kind kind) 
     {
            this._point = pPoint;
            this._radius = r;
            this._color = pColor;
            this._kind = kind;
            setBoundary(_borders);
    }
     
    private void setBoundary(Rectangle b) {
            b.setBounds(_point.x - _radius, _point.y - _radius, 2 * _radius, 2 * _radius);
        }

        /**
         * Draw this node.
         */
        public void draw(Graphics g) {
            g.setColor(this._color);
            if (this._kind == Kind.DRAWINGPOINT) {
                g.fillOval(_borders.x, _borders.y, _borders.width, _borders.height);
            } /*else if (this.kind == Kind.Rounded) {
                g.fillRoundRect(b.x, b.y, b.width, b.height, r, r);
            } else if (this.kind == Kind.Square) {
                g.fillRect(b.x, b.y, b.width, b.height);
            }*/
            if (_selected) {
                g.setColor(Color.darkGray);
                g.drawRect(_borders.x, _borders.y, _borders.width, _borders.height);
            }
        }

        /**
         * Return this node's location.
         */
        public Point getLocation() {
            return _point;
        }

        /**
         * Return true if this node contains p.
         */
        public boolean contains(Point p) {
            return _borders.contains(p);
        }

        /**
         * Return true if this node is selected.
         */
        public boolean isSelected() {
            return _selected;
        }

        /**
         * Mark this node as selected.
         */
        public void setSelected(boolean selected) {
            this._selected = selected;
        }

        /**
         * Collected all the selected nodes in list.
         */
        public static void getSelected(ArrayList<DesignGraphic> list, ArrayList<DesignGraphic> selected) {
            selected.clear();
            for (DesignGraphic n : list) {
                if (n.isSelected()) {
                    selected.add(n);
                }
            }
        }

        /**
         * Select no nodes.
         */
        public static void selectNone(ArrayList<DesignGraphic> list) {
            for (DesignGraphic n : list) {
                n.setSelected(false);
            }
        }

        /**
         * Select a single node; return true if not already selected.
         */
        public static boolean selectOne(ArrayList<DesignGraphic> pList, Point pPoint) {
            for (DesignGraphic n : pList) {
                if (n.contains(pPoint)) {
                    if (!n.isSelected()) {
                        DesignGraphic.selectNone(pList);
                        n.setSelected(true);
                    }
                    return true;
                }
            }
            return false;
        }

        /**
         * Select each node in r.
         */
        public static void selectRect(ArrayList<DesignGraphic> pList, Rectangle pRectangle) {
            for (DesignGraphic n : pList) {
                n.setSelected(pRectangle.contains(n._point));
            }
        }

        /**
         * Toggle selected state of each node containing p.
         */
        public static void selectToggle(ArrayList<DesignGraphic> pList, Point pPoint) {
            for (DesignGraphic n : pList) {
                if (n.contains(pPoint)) {
                    n.setSelected(!n.isSelected());
                }
            }
        }

        /**
         * Update each node's position by d (delta).
         */
        public static void updatePosition(List<DesignGraphic> pList, Point pDelta) {
            for (DesignGraphic n : pList) {
                if (n.isSelected()) {
                    n._point.x += pDelta.x;
                    n._point.y += pDelta.y;
                    n.setBoundary(n._borders);
                }
            }
        }

        /**
         * Update each node's radius r.
         */
        public static void updateRadius(List<DesignGraphic> pList, int pRadius) {
            for (DesignGraphic n : pList) {
                if (n.isSelected()) {
                    n._radius = pRadius;
                    n.setBoundary(n._borders);
                }
            }
        }

        /**
         * Update each node's color.
         */
        public static void updateColor(List<DesignGraphic> pList, Color pColor) {
            for (DesignGraphic n : list) {
                if (n.isSelected()) {
                    n.color = color;
                }
            }
        }

        /**
         * Update each node's kind.
         */
        public static void updateKind(List<Node> list, Kind kind) {
            for (Node n : list) {
                if (n.isSelected()) {
                    n.kind = kind;
                }
            }
        } 
        
    private Point _point;
    private int _radius;
    private Color _color;
    private Kind _kind;
    private boolean _selected = false;
    private Rectangle _borders = new Rectangle();
    
}
