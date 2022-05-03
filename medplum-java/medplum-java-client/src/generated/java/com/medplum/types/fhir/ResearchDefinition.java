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
  Optional<Reference> exposureAlternative();

  Optional<List<UsageContext>> useContext();

  Optional<List<CodeableConcept>> topic();

  String resourceType();

  Optional<Period> effectivePeriod();

  Optional<Uri> implicitRules();

  Optional<ResearchdefinitionStatus> status();

  Optional<List<ContactDetail>> editor();

  Optional<Uri> url();

  Optional<Narrative> text();

  Optional<Boolean> experimental();

  Optional<DateTime> date();

  Optional<Markdown> purpose();

  Optional<String> version();

  Optional<String> shortTitle();

  Optional<List<ContactDetail>> contact();

  Optional<String> title();

  Optional<List<ContactDetail>> author();

  Optional<Id> id();

  Optional<Markdown> copyright();

  Optional<List<RelatedArtifact>> relatedArtifact();

  Optional<Markdown> description();

  Optional<Reference> outcome();

  Optional<String> usage();

  Optional<List<ResourceList>> contained();

  Optional<List<Extension>> extension();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Canonical>> library();

  Optional<String> name();

  Optional<List<CodeableConcept>> jurisdiction();

  Optional<List<Identifier>> identifier();

  Optional<Reference> subjectReference();

  Optional<String> subtitle();

  Optional<CodeableConcept> subjectCodeableConcept();

  Optional<Reference> exposure();

  Optional<Date> approvalDate();

  Optional<List<ContactDetail>> endorser();

  Optional<List<String>> comment();

  Optional<List<ContactDetail>> reviewer();

  Optional<Code> language();

  Optional<Date> lastReviewDate();

  Optional<Meta> meta();

  Reference population();

  Optional<String> publisher();

  static ImmutableResearchDefinition.ResourceTypeBuildStage builder() {
    return ImmutableResearchDefinition.builder();
  }
}
