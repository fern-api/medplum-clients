package com.fhir;

import com.StagedBuilderStyle;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
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
  Optional<CodeableConcept> phase();

  Optional<List<RelatedArtifact>> relatedArtifact();

  Optional<List<ContactDetail>> contact();

  Optional<List<CodeableConcept>> keyword();

  Optional<List<ResourceList>> contained();

  Optional<List<Extension>> extension();

  Optional<List<Reference>> enrollment();

  Optional<CodeableConcept> primaryPurposeType();

  Optional<List<Reference>> protocol();

  Optional<uri> implicitRules();

  Optional<List<Reference>> partOf();

  Optional<Period> period();

  Optional<List<Identifier>> identifier();

  Optional<String> title();

  Optional<List<Extension>> modifierExtension();

  Optional<markdown> description();

  Optional<List<ResearchStudy_Arm>> arm();

  Optional<List<Reference>> site();

  Optional<id> id();

  Optional<List<ResearchStudy_Objective>> objective();

  Optional<List<Annotation>> note();

  Optional<Narrative> text();

  Optional<CodeableConcept> reasonStopped();

  Optional<List<CodeableConcept>> category();

  String resourceType();

  Optional<List<CodeableConcept>> focus();

  Optional<code> language();

  Optional<Meta> meta();

  Optional<ResearchstudyStatus> status();

  Optional<Reference> sponsor();

  Optional<Reference> principalInvestigator();

  Optional<List<CodeableConcept>> condition();

  Optional<List<CodeableConcept>> location();

  static ImmutableResearchStudy.ResourceTypeBuildStage builder() {
    return ImmutableResearchStudy.builder();
  }
}
