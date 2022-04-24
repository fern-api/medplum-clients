package com.fhir;

import com.StagedBuilderStyle;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableResearchDefinition.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface ResearchDefinition {
  Optional<uri> implicitRules();

  Optional<markdown> description();

  Optional<String> title();

  Optional<List<Extension>> extension();

  Optional<List<RelatedArtifact>> relatedArtifact();

  Optional<Reference> outcome();

  Optional<Narrative> text();

  Optional<Reference> subjectReference();

  Optional<date> lastReviewDate();

  Optional<List<ResourceList>> contained();

  Optional<List<ContactDetail>> contact();

  Optional<String> usage();

  Optional<code> language();

  Optional<List<CodeableConcept>> topic();

  Optional<List<String>> comment();

  Optional<Meta> meta();

  Optional<uri> url();

  Optional<ResearchdefinitionStatus> status();

  Optional<List<ContactDetail>> editor();

  Optional<String> subtitle();

  Optional<CodeableConcept> subjectCodeableConcept();

  Reference population();

  Optional<date> approvalDate();

  Optional<List<CodeableConcept>> jurisdiction();

  Optional<markdown> purpose();

  Optional<List<canonical>> library();

  Optional<List<Extension>> modifierExtension();

  Optional<markdown> copyright();

  Optional<String> publisher();

  Optional<Reference> exposure();

  String resourceType();

  Optional<Period> effectivePeriod();

  Optional<String> version();

  Optional<Reference> exposureAlternative();

  Optional<List<UsageContext>> useContext();

  Optional<id> id();

  Optional<String> shortTitle();

  Optional<List<ContactDetail>> endorser();

  Optional<List<ContactDetail>> author();

  Optional<List<Identifier>> identifier();

  Optional<List<ContactDetail>> reviewer();

  Optional<String> name();

  Optional<Boolean> experimental();

  Optional<dateTime> date();

  static ImmutableResearchDefinition.PopulationBuildStage builder() {
    return ImmutableResearchDefinition.builder();
  }
}
