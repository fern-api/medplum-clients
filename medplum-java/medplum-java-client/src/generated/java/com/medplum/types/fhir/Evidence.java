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
  Optional<DateTime> date();

  Optional<List<Extension>> modifierExtension();

  Optional<Uri> implicitRules();

  String resourceType();

  Optional<List<ContactDetail>> reviewer();

  Optional<List<Annotation>> note();

  Reference exposureBackground();

  Optional<EvidenceStatus> status();

  Optional<String> title();

  Optional<List<CodeableConcept>> jurisdiction();

  Optional<Code> language();

  Optional<Meta> meta();

  Optional<List<ContactDetail>> contact();

  Optional<Period> effectivePeriod();

  Optional<List<UsageContext>> useContext();

  Optional<Date> approvalDate();

  Optional<String> publisher();

  Optional<List<ContactDetail>> editor();

  Optional<String> subtitle();

  Optional<List<ContactDetail>> author();

  Optional<String> shortTitle();

  Optional<Markdown> description();

  Optional<List<RelatedArtifact>> relatedArtifact();

  Optional<List<ResourceList>> contained();

  Optional<List<Identifier>> identifier();

  Optional<List<ContactDetail>> endorser();

  Optional<Id> id();

  Optional<Narrative> text();

  Optional<String> name();

  Optional<Uri> url();

  Optional<List<CodeableConcept>> topic();

  Optional<List<Reference>> exposureVariant();

  Optional<Date> lastReviewDate();

  Optional<List<Reference>> outcome();

  Optional<Markdown> copyright();

  Optional<List<Extension>> extension();

  Optional<String> version();

  static ImmutableEvidence.ResourceTypeBuildStage builder() {
    return ImmutableEvidence.builder();
  }
}
