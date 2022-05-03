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
  Optional<Quantity> valueQuantity();

  Optional<Double> valueInteger();

  Optional<Double> valueDecimal();

  Optional<String> valueTime();

  Optional<Reference> valueReference();

  Optional<String> valueDate();

  Optional<List<Extension>> extension();

  Optional<List<Extension>> modifierExtension();

  Optional<String> valueDateTime();

  Optional<String> valueUri();

  Optional<Attachment> valueAttachment();

  Optional<String> id();

  Optional<String> valueString();

  Optional<Boolean> valueBoolean();

  Optional<Coding> valueCoding();

  static ImmutableContract_Answer.Builder builder() {
    return ImmutableContract_Answer.builder();
  }
}
