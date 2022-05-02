package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.medplum.StagedBuilderStyle;
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
  Optional<Markdown> description();

  Optional<Code> language();

  Optional<Boolean> experimental();

  Optional<String> usage();

  Optional<Period> effectivePeriod();

  Optional<Date> lastReviewDate();

  Optional<Markdown> copyright();

  Optional<Markdown> purpose();

  Optional<List<String>> comment();

  Optional<Id> id();

  Optional<List<Canonical>> library();

  Optional<List<CodeableConcept>> topic();

  Optional<List<ResourceList>> contained();

  Optional<List<Identifier>> identifier();

  String resourceType();

  Optional<Reference> exposureAlternative();

  Optional<String> name();

  Optional<CodeableConcept> subjectCodeableConcept();

  Optional<DateTime> date();

  Optional<String> publisher();

  Optional<Reference> exposure();

  Optional<String> shortTitle();

  Optional<String> subtitle();

  Optional<List<ContactDetail>> endorser();

  Optional<Narrative> text();

  Optional<ResearchdefinitionStatus> status();

  Optional<Reference> subjectReference();

  Optional<List<ContactDetail>> reviewer();

  Optional<List<UsageContext>> useContext();

  Optional<List<RelatedArtifact>> relatedArtifact();

  Optional<List<ContactDetail>> editor();

  Optional<String> title();

  Optional<String> version();

  Optional<List<CodeableConcept>> jurisdiction();

  Optional<Uri> implicitRules();

  Optional<Meta> meta();

  Optional<List<Extension>> modifierExtension();

  Reference population();

  Optional<Uri> url();

  Optional<List<ContactDetail>> author();

  Optional<Date> approvalDate();

  Optional<Reference> outcome();

  Optional<List<Extension>> extension();

  Optional<List<ContactDetail>> contact();

  static ImmutableResearchDefinition.ResourceTypeBuildStage builder() {
    return ImmutableResearchDefinition.builder();
  }
}
