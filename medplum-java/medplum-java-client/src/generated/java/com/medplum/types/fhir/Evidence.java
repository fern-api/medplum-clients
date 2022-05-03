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
    as = ImmutableEvidence.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Evidence {
  Optional<Uri> implicitRules();

  Optional<String> title();

  Optional<List<RelatedArtifact>> relatedArtifact();

  Optional<List<Identifier>> identifier();

  Optional<List<Extension>> extension();

  Optional<Date> approvalDate();

  Optional<EvidenceStatus> status();

  Optional<Narrative> text();

  Optional<String> shortTitle();

  Optional<Period> effectivePeriod();

  Optional<List<ContactDetail>> contact();

  Optional<String> subtitle();

  Optional<List<Extension>> modifierExtension();

  Optional<DateTime> date();

  Optional<Markdown> copyright();

  Optional<Date> lastReviewDate();

  Optional<List<ContactDetail>> reviewer();

  Optional<Id> id();

  Optional<String> name();

  Optional<Code> language();

  Optional<Markdown> description();

  Optional<List<Annotation>> note();

  String resourceType();

  Optional<List<ResourceList>> contained();

  Optional<String> publisher();

  Optional<List<CodeableConcept>> topic();

  Reference exposureBackground();

  Optional<List<ContactDetail>> author();

  Optional<Uri> url();

  Optional<List<Reference>> exposureVariant();

  Optional<List<Reference>> outcome();

  Optional<List<ContactDetail>> editor();

  Optional<List<ContactDetail>> endorser();

  Optional<Meta> meta();

  Optional<List<UsageContext>> useContext();

  Optional<List<CodeableConcept>> jurisdiction();

  Optional<String> version();

  static ImmutableEvidence.ResourceTypeBuildStage builder() {
    return ImmutableEvidence.builder();
  }
}
