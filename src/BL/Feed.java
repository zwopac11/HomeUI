/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BL;

import java.awt.List;
import java.util.ArrayList;

/**
 *
 * @author Claudio
 */
public class Feed {
    private String link;
    private String title;
    private String desc;
    private String lag;
    private String copyright;
    private String pubDate;
    private List<FeedMessage> entries = new ArrayList<FeedMessage>();
}
