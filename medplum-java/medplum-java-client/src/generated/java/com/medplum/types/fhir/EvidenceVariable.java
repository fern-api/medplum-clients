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
  Optional<List<CodeableConcept>> topic();

  Optional<Uri> implicitRules();

  Optional<Markdown> description();

  List<EvidenceVariable_Characteristic> characteristic();

  String resourceType();

  Optional<EvidencevariableStatus> status();

  Optional<List<ContactDetail>> editor();

  Optional<List<ContactDetail>> reviewer();

  Optional<String> name();

  Optional<Markdown> copyright();

  Optional<List<UsageContext>> useContext();

  Optional<List<ContactDetail>> author();

  Optional<List<ResourceList>> contained();

  Optional<String> version();

  Optional<List<RelatedArtifact>> relatedArtifact();

  Optional<Code> language();

  Optional<String> publisher();

  Optional<List<Extension>> extension();

  Optional<String> subtitle();

  Optional<List<Annotation>> note();

  Optional<EvidencevariableType> type();

  Optional<List<ContactDetail>> contact();

  Optional<List<CodeableConcept>> jurisdiction();

  Optional<Meta> meta();

  Optional<List<Extension>> modifierExtension();

  Optional<Id> id();

  Optional<Uri> url();

  Optional<List<Identifier>> identifier();

  Optional<DateTime> date();

  Optional<List<ContactDetail>> endorser();

  Optional<Date> lastReviewDate();

  Optional<Narrative> text();

  Optional<Date> approvalDate();

  Optional<String> shortTitle();

  Optional<String> title();

  Optional<Period> effectivePeriod();

  static ImmutableEvidenceVariable.ResourceTypeBuildStage builder() {
    return ImmutableEvidenceVariable.builder();
  }
}
