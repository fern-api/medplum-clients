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
  Optional<String> shortTitle();

  Optional<List<Annotation>> note();

  Optional<Uri> url();

  Optional<List<ResourceList>> contained();

  Optional<String> publisher();

  Optional<List<ContactDetail>> editor();

  Optional<List<ContactDetail>> reviewer();

  List<EvidenceVariable_Characteristic> characteristic();

  Optional<DateTime> date();

  Optional<Period> effectivePeriod();

  Optional<List<Extension>> extension();

  Optional<Uri> implicitRules();

  Optional<List<Identifier>> identifier();

  Optional<List<ContactDetail>> contact();

  Optional<EvidencevariableStatus> status();

  Optional<List<Extension>> modifierExtension();

  Optional<Markdown> copyright();

  Optional<Meta> meta();

  Optional<String> title();

  Optional<Date> lastReviewDate();

  Optional<String> name();

  Optional<List<ContactDetail>> endorser();

  Optional<List<ContactDetail>> author();

  Optional<String> version();

  Optional<List<CodeableConcept>> jurisdiction();

  Optional<List<UsageContext>> useContext();

  Optional<EvidencevariableType> type();

  Optional<List<RelatedArtifact>> relatedArtifact();

  Optional<List<CodeableConcept>> topic();

  Optional<Date> approvalDate();

  Optional<Narrative> text();

  Optional<Markdown> description();

  Optional<String> subtitle();

  Optional<Code> language();

  String resourceType();

  Optional<Id> id();

  static ImmutableEvidenceVariable.ResourceTypeBuildStage builder() {
    return ImmutableEvidenceVariable.builder();
  }
}
