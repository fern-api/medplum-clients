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
    as = ImmutableResearchStudy.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface ResearchStudy {
  Optional<Meta> meta();

  Optional<List<ResearchStudy_Objective>> objective();

  Optional<List<Annotation>> note();

  Optional<List<CodeableConcept>> condition();

  Optional<List<RelatedArtifact>> relatedArtifact();

  Optional<ResearchstudyStatus> status();

  Optional<String> title();

  Optional<Reference> principalInvestigator();

  Optional<Uri> implicitRules();

  Optional<List<CodeableConcept>> location();

  Optional<List<ResourceList>> contained();

  Optional<List<Reference>> partOf();

  Optional<List<ContactDetail>> contact();

  Optional<List<Extension>> modifierExtension();

  Optional<CodeableConcept> reasonStopped();

  Optional<Id> id();

  Optional<List<Identifier>> identifier();

  Optional<List<CodeableConcept>> keyword();

  Optional<Narrative> text();

  Optional<Markdown> description();

  Optional<List<Reference>> enrollment();

  Optional<Period> period();

  Optional<CodeableConcept> primaryPurposeType();

  Optional<List<CodeableConcept>> focus();

  Optional<List<CodeableConcept>> category();

  Optional<List<ResearchStudy_Arm>> arm();

  Optional<Code> language();

  String resourceType();

  Optional<List<Reference>> protocol();

  Optional<List<Reference>> site();

  Optional<Reference> sponsor();

  Optional<List<Extension>> extension();

  Optional<CodeableConcept> phase();

  static ImmutableResearchStudy.ResourceTypeBuildStage builder() {
    return ImmutableResearchStudy.builder();
  }
}
