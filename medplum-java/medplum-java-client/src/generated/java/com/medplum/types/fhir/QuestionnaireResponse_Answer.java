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
    as = ImmutableQuestionnaireResponse_Answer.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface QuestionnaireResponse_Answer {
  Optional<List<Extension>> extension();

  Optional<String> valueTime();

  Optional<List<Extension>> modifierExtension();

  Optional<String> valueDate();

  Optional<Reference> valueReference();

  Optional<Quantity> valueQuantity();

  Optional<Attachment> valueAttachment();

  Optional<String> id();

  Optional<List<QuestionnaireResponse_Item>> item();

  Optional<String> valueString();

  Optional<Coding> valueCoding();

  Optional<String> valueUri();

  Optional<Boolean> valueBoolean();

  Optional<Double> valueDecimal();

  Optional<String> valueDateTime();

  Optional<Double> valueInteger();

  static ImmutableQuestionnaireResponse_Answer.Builder builder() {
    return ImmutableQuestionnaireResponse_Answer.builder();
  }
}
