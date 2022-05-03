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
  Reference patient();

  Optional<Period> bornPeriod();

  Optional<Range> deceasedRange();

  Optional<Boolean> deceasedBoolean();

  Optional<List<CodeableConcept>> reasonCode();

  Optional<List<Uri>> instantiatesUri();

  Optional<Code> language();

  Optional<DateTime> date();

  Optional<CodeableConcept> dataAbsentReason();

  CodeableConcept relationship();

  Optional<List<Extension>> modifierExtension();

  Optional<String> deceasedDate();

  Optional<List<Annotation>> note();

  Optional<String> bornDate();

  Optional<List<Reference>> reasonReference();

  Optional<String> ageString();

  String resourceType();

  Optional<List<Canonical>> instantiatesCanonical();

  Optional<Narrative> text();

  Optional<List<Identifier>> identifier();

  Optional<Id> id();

  Optional<String> name();

  Optional<String> deceasedString();

  Optional<List<ResourceList>> contained();

  Optional<Meta> meta();

  Optional<FamilymemberhistoryStatus> status();

  Optional<Range> ageRange();

  Optional<Age> ageAge();

  Optional<Uri> implicitRules();

  Optional<CodeableConcept> sex();

  Optional<List<FamilyMemberHistory_Condition>> condition();

  Optional<List<Extension>> extension();

  Optional<String> bornString();

  Optional<Boolean> estimatedAge();

  Optional<Age> deceasedAge();

  static ImmutableFamilyMemberHistory.PatientBuildStage builder() {
    return ImmutableFamilyMemberHistory.builder();
  }
}
