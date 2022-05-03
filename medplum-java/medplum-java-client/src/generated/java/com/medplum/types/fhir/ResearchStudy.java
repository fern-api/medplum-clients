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
  Optional<List<CodeableConcept>> keyword();

  Optional<Id> id();

  Optional<List<Reference>> enrollment();

  Optional<List<ResearchStudy_Arm>> arm();

  Optional<List<CodeableConcept>> category();

  Optional<List<Identifier>> identifier();

  Optional<List<ResearchStudy_Objective>> objective();

  Optional<List<ResourceList>> contained();

  Optional<List<CodeableConcept>> focus();

  Optional<CodeableConcept> phase();

  Optional<List<CodeableConcept>> location();

  Optional<List<Reference>> protocol();

  Optional<Reference> principalInvestigator();

  Optional<Narrative> text();

  Optional<List<CodeableConcept>> condition();

  Optional<List<Annotation>> note();

  Optional<Code> language();

  Optional<CodeableConcept> reasonStopped();

  Optional<List<RelatedArtifact>> relatedArtifact();

  Optional<Reference> sponsor();

  Optional<Period> period();

  Optional<Meta> meta();

  Optional<Markdown> description();

  Optional<List<Extension>> extension();

  Optional<List<Reference>> partOf();

  Optional<List<ContactDetail>> contact();

  Optional<String> title();

  Optional<CodeableConcept> primaryPurposeType();

  Optional<Uri> implicitRules();

  Optional<List<Reference>> site();

  String resourceType();

  Optional<List<Extension>> modifierExtension();

  Optional<ResearchstudyStatus> status();

  static ImmutableResearchStudy.ResourceTypeBuildStage builder() {
    return ImmutableResearchStudy.builder();
  }
}
