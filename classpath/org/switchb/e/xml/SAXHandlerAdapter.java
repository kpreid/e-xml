package org.switchb.e.xml;

import java.io.IOException;

import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;
import org.xml.sax.ext.DefaultHandler2;

class SAXHandlerAdapter extends DefaultHandler2 {
	/**
	 * Forwards to the <var>target</var>.
	 * 
	 * The E object to forward events to.
	 */
	private final ESAXHandler target;

	/**
	 * @param target
	 *            The E object to forward events to.
	 */
	public SAXHandlerAdapter(ESAXHandler target) {
		super();
		this.target = target;
	}

	/**
	 * Forwards to the <var>target</var>.
	 * 
	 * @param eName
	 * @param aName
	 * @param type
	 * @param mode
	 * @param value
	 * @throws SAXException
	 * @see org.xml.sax.ext.DefaultHandler2#attributeDecl(java.lang.String,
	 *      java.lang.String, java.lang.String, java.lang.String,
	 *      java.lang.String)
	 */
	public void attributeDecl(String eName, String aName, String type,
	        String mode, String value) throws SAXException {
		target.attributeDecl(eName, aName, type, mode, value);
	}

	/**
	 * Forwards to the <var>target</var>.
	 * 
	 * @param ch
	 * @param start
	 * @param length
	 * @throws SAXException
	 * @see org.xml.sax.helpers.DefaultHandler#characters(char[], int, int)
	 */
	public void characters(char[] ch, int start, int length)
	        throws SAXException {
		target.characters(ch, start, length);
	}

	/**
	 * Forwards to the <var>target</var>.
	 * 
	 * @param ch
	 * @param start
	 * @param length
	 * @throws SAXException
	 * @see org.xml.sax.ext.DefaultHandler2#comment(char[], int, int)
	 */
	public void comment(char[] ch, int start, int length) throws SAXException {
		target.comment(ch, start, length);
	}

	/**
	 * Forwards to the <var>target</var>.
	 * 
	 * @param name
	 * @param model
	 * @throws SAXException
	 * @see org.xml.sax.ext.DefaultHandler2#elementDecl(java.lang.String,
	 *      java.lang.String)
	 */
	public void elementDecl(String name, String model) throws SAXException {
		target.elementDecl(name, model);
	}

	/**
	 * Forwards to the <var>target</var>.
	 * 
	 * @throws SAXException
	 * @see org.xml.sax.ext.DefaultHandler2#endCDATA()
	 */
	public void endCDATA() throws SAXException {
		target.endCDATA();
	}

	/**
	 * Forwards to the <var>target</var>.
	 * 
	 * @throws SAXException
	 * @see org.xml.sax.helpers.DefaultHandler#endDocument()
	 */
	public void endDocument() throws SAXException {
		target.endDocument();
	}

	/**
	 * Forwards to the <var>target</var>.
	 * 
	 * @throws SAXException
	 * @see org.xml.sax.ext.DefaultHandler2#endDTD()
	 */
	public void endDTD() throws SAXException {
		target.endDTD();
	}

	/**
	 * Forwards to the <var>target</var>.
	 * 
	 * @param uri
	 * @param localName
	 * @param qName
	 * @throws SAXException
	 * @see org.xml.sax.helpers.DefaultHandler#endElement(java.lang.String,
	 *      java.lang.String, java.lang.String)
	 */
	public void endElement(String uri, String localName, String qName)
	        throws SAXException {
		target.endElement(uri, localName, qName);
	}

	/**
	 * Forwards to the <var>target</var>.
	 * 
	 * @param name
	 * @throws SAXException
	 * @see org.xml.sax.ext.DefaultHandler2#endEntity(java.lang.String)
	 */
	public void endEntity(String name) throws SAXException {
		target.endEntity(name);
	}

	/**
	 * Forwards to the <var>target</var>.
	 * 
	 * @param prefix
	 * @throws SAXException
	 * @see org.xml.sax.helpers.DefaultHandler#endPrefixMapping(java.lang.String)
	 */
	public void endPrefixMapping(String prefix) throws SAXException {
		target.endPrefixMapping(prefix);
	}

	/**
	 * Forwards to the <var>target</var>.
	 * 
	 * @param e
	 * @throws SAXException
	 * @see org.xml.sax.helpers.DefaultHandler#error(org.xml.sax.SAXParseException)
	 */
	public void error(SAXParseException e) throws SAXException {
		target.error(e);
	}

	/**
	 * Forwards to the <var>target</var>.
	 * 
	 * @param name
	 * @param publicId
	 * @param systemId
	 * @throws SAXException
	 * @see org.xml.sax.ext.DefaultHandler2#externalEntityDecl(java.lang.String,
	 *      java.lang.String, java.lang.String)
	 */
	public void externalEntityDecl(String name, String publicId, String systemId)
	        throws SAXException {
		target.externalEntityDecl(name, publicId, systemId);
	}

	/**
	 * Forwards to the <var>target</var>.
	 * 
	 * @param e
	 * @throws SAXException
	 * @see org.xml.sax.helpers.DefaultHandler#fatalError(org.xml.sax.SAXParseException)
	 */
	public void fatalError(SAXParseException e) throws SAXException {
		target.fatalError(e);
	}

	/**
	 * Forwards to the <var>target</var>.
	 * 
	 * @param name
	 * @param baseURI
	 * @return
	 * @throws SAXException
	 * @throws IOException
	 * @see org.xml.sax.ext.DefaultHandler2#getExternalSubset(java.lang.String,
	 *      java.lang.String)
	 */
	public InputSource getExternalSubset(String name, String baseURI)
	        throws SAXException, IOException {
		return target.getExternalSubset(name, baseURI);
	}

	/**
	 * Forwards to the <var>target</var>.
	 * 
	 * @param ch
	 * @param start
	 * @param length
	 * @throws SAXException
	 * @see org.xml.sax.helpers.DefaultHandler#ignorableWhitespace(char[], int,
	 *      int)
	 */
	public void ignorableWhitespace(char[] ch, int start, int length)
	        throws SAXException {
		target.ignorableWhitespace(ch, start, length);
	}

	/**
	 * Forwards to the <var>target</var>.
	 * 
	 * @param name
	 * @param value
	 * @throws SAXException
	 * @see org.xml.sax.ext.DefaultHandler2#internalEntityDecl(java.lang.String,
	 *      java.lang.String)
	 */
	public void internalEntityDecl(String name, String value)
	        throws SAXException {
		target.internalEntityDecl(name, value);
	}

	/**
	 * Forwards to the <var>target</var>.
	 * 
	 * @param name
	 * @param publicId
	 * @param systemId
	 * @throws SAXException
	 * @see org.xml.sax.helpers.DefaultHandler#notationDecl(java.lang.String,
	 *      java.lang.String, java.lang.String)
	 */
	public void notationDecl(String name, String publicId, String systemId)
	        throws SAXException {
		target.notationDecl(name, publicId, systemId);
	}

	/**
	 * Forwards to the <var>target</var>.
	 * 
	 * @param target
	 * @param data
	 * @throws SAXException
	 * @see org.xml.sax.helpers.DefaultHandler#processingInstruction(java.lang.String,
	 *      java.lang.String)
	 */
	public void processingInstruction(String pitarget, String data)
	        throws SAXException {
		target.processingInstruction(pitarget, data);
	}

	/**
	 * Forwards to the <var>target</var>.
	 * 
	 * @param name
	 * @param publicId
	 * @param baseURI
	 * @param systemId
	 * @return
	 * @throws SAXException
	 * @throws IOException
	 * @see org.xml.sax.ext.DefaultHandler2#resolveEntity(java.lang.String,
	 *      java.lang.String, java.lang.String, java.lang.String)
	 */
	public InputSource resolveEntity(String name, String publicId,
	        String baseURI, String systemId) throws SAXException, IOException {
		return target.resolveEntity(name, publicId, baseURI, systemId);
	}

	/**
	 * Forwards to the <var>target</var>.
	 * 
	 * @param locator
	 * @see org.xml.sax.helpers.DefaultHandler#setDocumentLocator(org.xml.sax.Locator)
	 */
	public void setDocumentLocator(Locator locator) {
		target.setDocumentLocator(locator);
	}

	/**
	 * Forwards to the <var>target</var>.
	 * 
	 * @param name
	 * @throws SAXException
	 * @see org.xml.sax.helpers.DefaultHandler#skippedEntity(java.lang.String)
	 */
	public void skippedEntity(String name) throws SAXException {
		target.skippedEntity(name);
	}

	/**
	 * Forwards to the <var>target</var>.
	 * 
	 * @throws SAXException
	 * @see org.xml.sax.ext.DefaultHandler2#startCDATA()
	 */
	public void startCDATA() throws SAXException {
		target.startCDATA();
	}

	/**
	 * Forwards to the <var>target</var>.
	 * 
	 * @throws SAXException
	 * @see org.xml.sax.helpers.DefaultHandler#startDocument()
	 */
	public void startDocument() throws SAXException {
		target.startDocument();
	}

	/**
	 * Forwards to the <var>target</var>.
	 * 
	 * @param name
	 * @param publicId
	 * @param systemId
	 * @throws SAXException
	 * @see org.xml.sax.ext.DefaultHandler2#startDTD(java.lang.String,
	 *      java.lang.String, java.lang.String)
	 */
	public void startDTD(String name, String publicId, String systemId)
	        throws SAXException {
		target.startDTD(name, publicId, systemId);
	}

	/**
	 * Forwards to the <var>target</var>.
	 * 
	 * @param uri
	 * @param localName
	 * @param qName
	 * @param attributes
	 * @throws SAXException
	 * @see org.xml.sax.helpers.DefaultHandler#startElement(java.lang.String,
	 *      java.lang.String, java.lang.String, org.xml.sax.Attributes)
	 */
	public void startElement(String uri, String localName, String qName,
	        Attributes attributes) throws SAXException {
		target.startElement(uri, localName, qName, attributes);
	}

	/**
	 * Forwards to the <var>target</var>.
	 * 
	 * @param name
	 * @throws SAXException
	 * @see org.xml.sax.ext.DefaultHandler2#startEntity(java.lang.String)
	 */
	public void startEntity(String name) throws SAXException {
		target.startEntity(name);
	}

	/**
	 * Forwards to the <var>target</var>.
	 * 
	 * @param prefix
	 * @param uri
	 * @throws SAXException
	 * @see org.xml.sax.helpers.DefaultHandler#startPrefixMapping(java.lang.String,
	 *      java.lang.String)
	 */
	public void startPrefixMapping(String prefix, String uri)
	        throws SAXException {
		target.startPrefixMapping(prefix, uri);
	}

	/**
	 * Forwards to the <var>target</var>.
	 * 
	 * @param name
	 * @param publicId
	 * @param systemId
	 * @param notationName
	 * @throws SAXException
	 * @see org.xml.sax.helpers.DefaultHandler#unparsedEntityDecl(java.lang.String,
	 *      java.lang.String, java.lang.String, java.lang.String)
	 */
	public void unparsedEntityDecl(String name, String publicId,
	        String systemId, String notationName) throws SAXException {
		target.unparsedEntityDecl(name, publicId, systemId, notationName);
	}

	/**
	 * Forwards to the <var>target</var>.
	 * 
	 * @param e
	 * @throws SAXException
	 * @see org.xml.sax.helpers.DefaultHandler#warning(org.xml.sax.SAXParseException)
	 */
	public void warning(SAXParseException e) throws SAXException {
		target.warning(e);
	}

}