package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.medplum.StagedBuilderStyle;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableQuestionnaireResponse.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface QuestionnaireResponse {
  Optional<Reference> author();

  Optional<List<Reference>> partOf();

  Optional<List<QuestionnaireResponse_Item>> item();

  Optional<Id> id();

  Optional<DateTime> authored();

  Optional<Uri> implicitRules();

  Optional<Narrative> text();

  Optional<QuestionnaireresponseStatus> status();

  Optional<List<Extension>> extension();

  Optional<Meta> meta();

  Optional<Code> language();

  Optional<Identifier> identifier();

  String resourceType();

  Optional<List<Reference>> basedOn();

  Optional<List<ResourceList>> contained();

  Optional<Reference> source();

  Optional<Canonical> questionnaire();

  Optional<List<Extension>> modifierExtension();

  Optional<Reference> subject();

  Optional<Reference> encounter();

  static ImmutableQuestionnaireResponse.ResourceTypeBuildStage builder() {
    return ImmutableQuestionnaireResponse.builder();
  }
}
