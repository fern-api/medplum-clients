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
    as = ImmutableQuestionnaire_Initial.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Questionnaire_Initial {
  Optional<String> valueUri();

  Optional<Quantity> valueQuantity();

  Optional<String> valueDateTime();

  Optional<List<Extension>> extension();

  Optional<String> valueDate();

  Optional<Boolean> valueBoolean();

  Optional<Double> valueInteger();

  Optional<Coding> valueCoding();

  Optional<String> valueTime();

  Optional<Attachment> valueAttachment();

  Optional<String> id();

  Optional<Double> valueDecimal();

  Optional<Reference> valueReference();

  Optional<List<Extension>> modifierExtension();

  Optional<String> valueString();

  static ImmutableQuestionnaire_Initial.Builder builder() {
    return ImmutableQuestionnaire_Initial.builder();
  }
}
