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
    as = ImmutableEvidenceVariable.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface EvidenceVariable {
  Optional<List<UsageContext>> useContext();

  Optional<List<ResourceList>> contained();

  Optional<String> title();

  Optional<Period> effectivePeriod();

  Optional<List<ContactDetail>> endorser();

  Optional<Markdown> copyright();

  Optional<Markdown> description();

  Optional<List<Identifier>> identifier();

  Optional<DateTime> date();

  Optional<List<Annotation>> note();

  Optional<List<Extension>> extension();

  Optional<Uri> url();

  Optional<String> shortTitle();

  Optional<Date> lastReviewDate();

  Optional<Id> id();

  Optional<String> version();

  Optional<List<CodeableConcept>> topic();

  List<EvidenceVariable_Characteristic> characteristic();

  Optional<String> subtitle();

  Optional<EvidencevariableType> type();

  Optional<List<RelatedArtifact>> relatedArtifact();

  Optional<List<ContactDetail>> contact();

  Optional<List<Extension>> modifierExtension();

  Optional<String> name();

  String resourceType();

  Optional<List<ContactDetail>> editor();

  Optional<List<CodeableConcept>> jurisdiction();

  Optional<Code> language();

  Optional<Meta> meta();

  Optional<List<ContactDetail>> reviewer();

  Optional<Uri> implicitRules();

  Optional<String> publisher();

  Optional<Narrative> text();

  Optional<List<ContactDetail>> author();

  Optional<EvidencevariableStatus> status();

  Optional<Date> approvalDate();

  static ImmutableEvidenceVariable.ResourceTypeBuildStage builder() {
    return ImmutableEvidenceVariable.builder();
  }
}
