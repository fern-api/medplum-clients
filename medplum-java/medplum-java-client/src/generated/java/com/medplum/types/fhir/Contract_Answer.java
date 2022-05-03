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
  Optional<Boolean> valueBoolean();

  Optional<Double> valueInteger();

  Optional<String> valueDateTime();

  Optional<String> valueTime();

  Optional<List<Extension>> modifierExtension();

  Optional<String> valueString();

  Optional<Attachment> valueAttachment();

  Optional<Coding> valueCoding();

  Optional<String> valueDate();

  Optional<List<Extension>> extension();

  Optional<String> id();

  Optional<String> valueUri();

  Optional<Double> valueDecimal();

  Optional<Reference> valueReference();

  Optional<Quantity> valueQuantity();

  static ImmutableContract_Answer.Builder builder() {
    return ImmutableContract_Answer.builder();
  }
}
