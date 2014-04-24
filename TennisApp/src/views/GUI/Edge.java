/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package views.GUI;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

/**
 *
 * @author Carlos
 */
 public class Edge {

        

        public Edge(DesignGraphic n1, DesignGraphic n2) {
            this._n1 = n1;
            this._n2 = n2;
        }

        public void draw(Graphics g) {
            Point p1 = _n1.getLocation();
            Point p2 = _n2.getLocation();
            g.setColor(Color.darkGray);
            g.drawLine(p1.x, p1.y, p2.x, p2.y);
        }
        
        private DesignGraphic _n1;
        private DesignGraphic _n2;
    }
