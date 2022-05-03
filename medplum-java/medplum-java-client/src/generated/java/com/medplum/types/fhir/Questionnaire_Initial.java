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
  Optional<Quantity> valueQuantity();

  Optional<Attachment> valueAttachment();

  Optional<Double> valueDecimal();

  Optional<List<Extension>> extension();

  Optional<String> valueUri();

  Optional<Coding> valueCoding();

  Optional<String> valueDateTime();

  Optional<String> id();

  Optional<String> valueDate();

  Optional<String> valueString();

  Optional<Reference> valueReference();

  Optional<List<Extension>> modifierExtension();

  Optional<Double> valueInteger();

  Optional<Boolean> valueBoolean();

  Optional<String> valueTime();

  static ImmutableQuestionnaire_Initial.Builder builder() {
    return ImmutableQuestionnaire_Initial.builder();
  }
}
