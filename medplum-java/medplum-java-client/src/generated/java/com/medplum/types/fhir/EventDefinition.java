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
    as = ImmutableEventDefinition.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface EventDefinition {
  Optional<Narrative> text();

  Optional<String> subtitle();

  Optional<String> version();

  Optional<List<ContactDetail>> editor();

  Optional<List<UsageContext>> useContext();

  Optional<DateTime> date();

  Optional<Markdown> purpose();

  Optional<List<Extension>> modifierExtension();

  Optional<Uri> implicitRules();

  Optional<Date> approvalDate();

  Optional<Date> lastReviewDate();

  Optional<List<CodeableConcept>> jurisdiction();

  Optional<List<ResourceList>> contained();

  Optional<List<CodeableConcept>> topic();

  Optional<List<RelatedArtifact>> relatedArtifact();

  Optional<Reference> subjectReference();

  Optional<String> publisher();

  Optional<List<Identifier>> identifier();

  Optional<CodeableConcept> subjectCodeableConcept();

  Optional<List<ContactDetail>> contact();

  Optional<String> name();

  List<TriggerDefinition> trigger();

  Optional<Id> id();

  Optional<List<Extension>> extension();

  Optional<List<ContactDetail>> endorser();

  Optional<Markdown> description();

  Optional<List<ContactDetail>> reviewer();

  Optional<Boolean> experimental();

  Optional<Uri> url();

  Optional<EventdefinitionStatus> status();

  Optional<Markdown> copyright();

  String resourceType();

  Optional<List<ContactDetail>> author();

  Optional<String> usage();

  Optional<Code> language();

  Optional<Meta> meta();

  Optional<String> title();

  Optional<Period> effectivePeriod();

  static ImmutableEventDefinition.ResourceTypeBuildStage builder() {
    return ImmutableEventDefinition.builder();
  }
}
