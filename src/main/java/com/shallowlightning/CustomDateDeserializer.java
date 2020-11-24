package com.shallowlightning;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CustomDateDeserializer extends StdDeserializer<Date> {

    private static final long serialVersionUID = -5451717385630622729L;
    private SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");

    public CustomDateDeserializer() {
        this(null);
    }

    public CustomDateDeserializer(final Class<?> vc) {
        super(vc);
    }

    @Override
    public Date deserialize(final JsonParser jsonparser, final DeserializationContext context) throws IOException, JsonProcessingException {
        final String date = jsonparser.getText();
        try {
            return formatter.parse(date);
        } catch (final ParseException e) {
            throw new RuntimeException(e);
        }
    }

}