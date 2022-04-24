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
    as = ImmutableEventDefinition.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface EventDefinition {
  Optional<date> approvalDate();

  Optional<code> language();

  Optional<date> lastReviewDate();

  Optional<String> publisher();

  Optional<List<RelatedArtifact>> relatedArtifact();

  Optional<List<Identifier>> identifier();

  Optional<List<Extension>> extension();

  Optional<uri> url();

  Optional<Reference> subjectReference();

  Optional<dateTime> date();

  Optional<List<CodeableConcept>> topic();

  Optional<List<ContactDetail>> contact();

  String resourceType();

  Optional<markdown> purpose();

  Optional<List<ContactDetail>> reviewer();

  Optional<EventdefinitionStatus> status();

  Optional<List<UsageContext>> useContext();

  Optional<String> usage();

  Optional<Period> effectivePeriod();

  Optional<String> subtitle();

  Optional<String> name();

  Optional<Narrative> text();

  Optional<List<CodeableConcept>> jurisdiction();

  Optional<List<ResourceList>> contained();

  Optional<markdown> description();

  Optional<Meta> meta();

  Optional<markdown> copyright();

  Optional<List<ContactDetail>> author();

  Optional<String> version();

  Optional<List<Extension>> modifierExtension();

  Optional<CodeableConcept> subjectCodeableConcept();

  Optional<String> title();

  Optional<id> id();

  Optional<Boolean> experimental();

  Optional<List<ContactDetail>> editor();

  Optional<uri> implicitRules();

  List<TriggerDefinition> trigger();

  Optional<List<ContactDetail>> endorser();

  static ImmutableEventDefinition.ResourceTypeBuildStage builder() {
    return ImmutableEventDefinition.builder();
  }
}
