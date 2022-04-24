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
    as = ImmutableEvidence.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Evidence {
  Optional<List<Identifier>> identifier();

  Optional<id> id();

  Optional<date> lastReviewDate();

  Optional<uri> implicitRules();

  Optional<markdown> copyright();

  Optional<String> name();

  Optional<dateTime> date();

  Optional<List<CodeableConcept>> jurisdiction();

  Optional<List<ContactDetail>> author();

  Optional<Period> effectivePeriod();

  Optional<List<UsageContext>> useContext();

  Optional<Narrative> text();

  Optional<List<ContactDetail>> editor();

  String resourceType();

  Optional<String> title();

  Optional<String> publisher();

  Optional<List<Reference>> exposureVariant();

  Optional<List<Extension>> extension();

  Optional<String> shortTitle();

  Optional<date> approvalDate();

  Optional<String> version();

  Optional<List<Extension>> modifierExtension();

  Optional<markdown> description();

  Optional<uri> url();

  Optional<List<ContactDetail>> contact();

  Optional<List<ContactDetail>> endorser();

  Optional<List<ResourceList>> contained();

  Optional<List<CodeableConcept>> topic();

  Optional<EvidenceStatus> status();

  Optional<List<ContactDetail>> reviewer();

  Optional<Meta> meta();

  Optional<String> subtitle();

  Optional<List<Annotation>> note();

  Optional<List<Reference>> outcome();

  Optional<List<RelatedArtifact>> relatedArtifact();

  Reference exposureBackground();

  Optional<code> language();

  static ImmutableEvidence.ResourceTypeBuildStage builder() {
    return ImmutableEvidence.builder();
  }
}
