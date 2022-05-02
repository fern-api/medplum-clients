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
  String resourceType();

  Optional<List<Reference>> partOf();

  Optional<DateTime> authored();

  Optional<Reference> subject();

  Optional<Narrative> text();

  Optional<Identifier> identifier();

  Optional<Reference> encounter();

  Optional<Id> id();

  Optional<Reference> source();

  Optional<Canonical> questionnaire();

  Optional<Uri> implicitRules();

  Optional<List<Reference>> basedOn();

  Optional<Code> language();

  Optional<List<ResourceList>> contained();

  Optional<List<Extension>> modifierExtension();

  Optional<Meta> meta();

  Optional<Reference> author();

  Optional<QuestionnaireresponseStatus> status();

  Optional<List<QuestionnaireResponse_Item>> item();

  Optional<List<Extension>> extension();

  static ImmutableQuestionnaireResponse.ResourceTypeBuildStage builder() {
    return ImmutableQuestionnaireResponse.builder();
  }
}
