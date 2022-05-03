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
  Optional<Attachment> valueAttachment();

  Optional<Double> valueInteger();

  Optional<String> valueTime();

  Optional<String> valueString();

  Optional<String> id();

  Optional<Coding> valueCoding();

  Optional<List<Extension>> modifierExtension();

  Optional<String> valueUri();

  Optional<Boolean> valueBoolean();

  Optional<String> valueDateTime();

  Optional<Quantity> valueQuantity();

  Optional<List<Extension>> extension();

  Optional<Reference> valueReference();

  Optional<String> valueDate();

  Optional<Double> valueDecimal();

  static ImmutableQuestionnaire_Initial.Builder builder() {
    return ImmutableQuestionnaire_Initial.builder();
  }
}
