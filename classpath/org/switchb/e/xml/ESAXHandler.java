package org.switchb.e.xml;

import org.xml.sax.ContentHandler;
import org.xml.sax.DTDHandler;
import org.xml.sax.EntityResolver;
import org.xml.sax.ErrorHandler;
import org.xml.sax.ext.DeclHandler;
import org.xml.sax.ext.EntityResolver2;
import org.xml.sax.ext.LexicalHandler;

/** This interface exists solely to get {@link org.erights.e.elib.deflect.Deflector deflected}, while containing all of the methods that one might want to override in a subclass of {@link org.xml.sax.ext.DefaultHandler2}. {@link SAXHandlerAdapter} then provides that generic subclass. */
public interface ESAXHandler extends ContentHandler, DTDHandler, EntityResolver, ErrorHandler, DeclHandler, EntityResolver2, LexicalHandler {

}
