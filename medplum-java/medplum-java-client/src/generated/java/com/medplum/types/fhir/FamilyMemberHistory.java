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
    as = ImmutableFamilyMemberHistory.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface FamilyMemberHistory {
  Optional<Boolean> deceasedBoolean();

  Optional<List<Uri>> instantiatesUri();

  Optional<String> bornString();

  String resourceType();

  Optional<List<CodeableConcept>> reasonCode();

  Optional<CodeableConcept> sex();

  Optional<String> deceasedString();

  Optional<Age> ageAge();

  Optional<String> deceasedDate();

  Optional<List<Identifier>> identifier();

  Optional<Meta> meta();

  Optional<String> name();

  Optional<Age> deceasedAge();

  Optional<Narrative> text();

  Optional<Range> ageRange();

  Optional<List<Extension>> extension();

  Optional<String> bornDate();

  Optional<List<Canonical>> instantiatesCanonical();

  Optional<Id> id();

  Optional<List<ResourceList>> contained();

  Optional<Period> bornPeriod();

  Optional<String> ageString();

  Optional<Boolean> estimatedAge();

  Optional<CodeableConcept> dataAbsentReason();

  Optional<Range> deceasedRange();

  Optional<List<Reference>> reasonReference();

  Optional<List<Annotation>> note();

  Optional<DateTime> date();

  Optional<List<Extension>> modifierExtension();

  Reference patient();

  Optional<FamilymemberhistoryStatus> status();

  Optional<List<FamilyMemberHistory_Condition>> condition();

  Optional<Code> language();

  Optional<Uri> implicitRules();

  CodeableConcept relationship();

  static ImmutableFamilyMemberHistory.ResourceTypeBuildStage builder() {
    return ImmutableFamilyMemberHistory.builder();
  }
}
