package com.fhir;

import com.StagedBuilderStyle;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableContract_Answer.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Contract_Answer {
  Optional<Boolean> valueBoolean();

  Optional<String> valueString();

  Optional<String> valueTime();

  Optional<String> id();

  Optional<List<Extension>> modifierExtension();

  Optional<Reference> valueReference();

  Optional<Attachment> valueAttachment();

  Optional<String> valueDate();

  Optional<Coding> valueCoding();

  Optional<Quantity> valueQuantity();

  Optional<String> valueUri();

  Optional<Double> valueInteger();

  Optional<String> valueDateTime();

  Optional<Double> valueDecimal();

  Optional<List<Extension>> extension();

  static ImmutableContract_Answer.Builder builder() {
    return ImmutableContract_Answer.builder();
  }
}
