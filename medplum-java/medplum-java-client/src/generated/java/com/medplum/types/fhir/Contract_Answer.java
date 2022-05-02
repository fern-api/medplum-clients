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

  Optional<List<Extension>> extension();

  Optional<String> valueDateTime();

  Optional<Coding> valueCoding();

  Optional<Quantity> valueQuantity();

  Optional<String> id();

  Optional<String> valueTime();

  Optional<Attachment> valueAttachment();

  Optional<String> valueUri();

  Optional<String> valueString();

  Optional<Double> valueInteger();

  Optional<Reference> valueReference();

  Optional<Double> valueDecimal();

  Optional<String> valueDate();

  Optional<Boolean> valueBoolean();

  static ImmutableContract_Answer.Builder builder() {
    return ImmutableContract_Answer.builder();
  }
}
