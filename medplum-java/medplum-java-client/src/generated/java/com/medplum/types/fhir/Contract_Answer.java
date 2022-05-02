package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.medplum.StagedBuilderStyle;
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
  Optional<List<Extension>> modifierExtension();

  Optional<String> valueDateTime();

  Optional<Boolean> valueBoolean();

  Optional<String> valueDate();

  Optional<Double> valueInteger();

  Optional<Quantity> valueQuantity();

  Optional<List<Extension>> extension();

  Optional<Reference> valueReference();

  Optional<String> id();

  Optional<String> valueTime();

  Optional<String> valueString();

  Optional<String> valueUri();

  Optional<Attachment> valueAttachment();

  Optional<Double> valueDecimal();

  Optional<Coding> valueCoding();

  static ImmutableContract_Answer.Builder builder() {
    return ImmutableContract_Answer.builder();
  }
}
