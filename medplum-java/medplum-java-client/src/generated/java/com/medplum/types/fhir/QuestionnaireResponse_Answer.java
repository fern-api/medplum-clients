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
  Optional<String> valueDateTime();

  Optional<String> valueUri();

  Optional<List<QuestionnaireResponse_Item>> item();

  Optional<Coding> valueCoding();

  Optional<String> valueDate();

  Optional<List<Extension>> modifierExtension();

  Optional<Double> valueInteger();

  Optional<Double> valueDecimal();

  Optional<String> valueTime();

  Optional<Attachment> valueAttachment();

  Optional<String> valueString();

  Optional<List<Extension>> extension();

  Optional<Reference> valueReference();

  Optional<Boolean> valueBoolean();

  Optional<Quantity> valueQuantity();

  Optional<String> id();

  static ImmutableQuestionnaireResponse_Answer.Builder builder() {
    return ImmutableQuestionnaireResponse_Answer.builder();
  }
}
