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
  Optional<List<ContactDetail>> author();

  Optional<Reference> exposure();

  Optional<Period> effectivePeriod();

  Optional<List<String>> comment();

  Optional<Markdown> description();

  Optional<List<ContactDetail>> reviewer();

  Optional<List<ContactDetail>> endorser();

  Optional<List<ContactDetail>> contact();

  Optional<Date> approvalDate();

  Optional<Markdown> purpose();

  Optional<String> usage();

  String resourceType();

  Optional<List<CodeableConcept>> topic();

  Optional<List<Extension>> extension();

  Optional<String> subtitle();

  Optional<Date> lastReviewDate();

  Optional<List<Extension>> modifierExtension();

  Optional<Reference> outcome();

  Optional<DateTime> date();

  Reference population();

  Optional<Uri> url();

  Optional<CodeableConcept> subjectCodeableConcept();

  Optional<Boolean> experimental();

  Optional<Meta> meta();

  Optional<Narrative> text();

  Optional<String> publisher();

  Optional<List<UsageContext>> useContext();

  Optional<Reference> exposureAlternative();

  Optional<String> version();

  Optional<List<RelatedArtifact>> relatedArtifact();

  Optional<Uri> implicitRules();

  Optional<String> name();

  Optional<ResearchdefinitionStatus> status();

  Optional<List<Identifier>> identifier();

  Optional<Id> id();

  Optional<Code> language();

  Optional<List<Canonical>> library();

  Optional<List<ContactDetail>> editor();

  Optional<String> title();

  Optional<List<ResourceList>> contained();

  Optional<Markdown> copyright();

  Optional<Reference> subjectReference();

  Optional<List<CodeableConcept>> jurisdiction();

  Optional<String> shortTitle();

  static ImmutableResearchDefinition.ResourceTypeBuildStage builder() {
    return ImmutableResearchDefinition.builder();
  }
}
