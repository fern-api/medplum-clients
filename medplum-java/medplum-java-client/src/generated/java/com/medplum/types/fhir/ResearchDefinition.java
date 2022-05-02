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
  Optional<Uri> implicitRules();

  Optional<Markdown> description();

  Optional<ResearchdefinitionStatus> status();

  Optional<Reference> outcome();

  Optional<List<String>> comment();

  Optional<Reference> exposureAlternative();

  Optional<String> name();

  Optional<Narrative> text();

  Optional<Uri> url();

  Optional<List<ContactDetail>> editor();

  Optional<Id> id();

  Optional<Date> lastReviewDate();

  Optional<List<CodeableConcept>> topic();

  Optional<List<CodeableConcept>> jurisdiction();

  Optional<List<ContactDetail>> endorser();

  Optional<Markdown> copyright();

  Optional<List<RelatedArtifact>> relatedArtifact();

  String resourceType();

  Optional<List<ContactDetail>> contact();

  Optional<String> shortTitle();

  Optional<String> usage();

  Optional<Reference> exposure();

  Optional<String> subtitle();

  Optional<String> title();

  Optional<CodeableConcept> subjectCodeableConcept();

  Reference population();

  Optional<Code> language();

  Optional<Reference> subjectReference();

  Optional<List<Canonical>> library();

  Optional<Meta> meta();

  Optional<String> version();

  Optional<List<Extension>> extension();

  Optional<Date> approvalDate();

  Optional<Period> effectivePeriod();

  Optional<Markdown> purpose();

  Optional<List<ContactDetail>> author();

  Optional<List<UsageContext>> useContext();

  Optional<List<Extension>> modifierExtension();

  Optional<Boolean> experimental();

  Optional<String> publisher();

  Optional<List<ContactDetail>> reviewer();

  Optional<DateTime> date();

  Optional<List<ResourceList>> contained();

  Optional<List<Identifier>> identifier();

  static ImmutableResearchDefinition.ResourceTypeBuildStage builder() {
    return ImmutableResearchDefinition.builder();
  }
}
