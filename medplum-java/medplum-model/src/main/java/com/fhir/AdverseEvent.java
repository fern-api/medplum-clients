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
    as = ImmutableAdverseEvent.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface AdverseEvent {
  Optional<Identifier> identifier();

  Optional<CodeableConcept> event();

  Optional<List<Reference>> subjectMedicalHistory();

  Optional<List<Reference>> contributor();

  Optional<List<AdverseEvent_SuspectEntity>> suspectEntity();

  Optional<uri> implicitRules();

  Optional<CodeableConcept> severity();

  Optional<List<Extension>> extension();

  Optional<code> language();

  Optional<List<Reference>> referenceDocument();

  Optional<List<Reference>> resultingCondition();

  Optional<List<ResourceList>> contained();

  Reference subject();

  Optional<dateTime> date();

  Optional<CodeableConcept> outcome();

  Optional<dateTime> recordedDate();

  Optional<Narrative> text();

  Optional<CodeableConcept> seriousness();

  Optional<id> id();

  Optional<Reference> encounter();

  String resourceType();

  Optional<List<Reference>> study();

  Optional<Reference> recorder();

  Optional<Meta> meta();

  Optional<Reference> location();

  Optional<dateTime> detected();

  Optional<List<Extension>> modifierExtension();

  Optional<AdverseeventActuality> actuality();

  Optional<List<CodeableConcept>> category();

  static ImmutableAdverseEvent.SubjectBuildStage builder() {
    return ImmutableAdverseEvent.builder();
  }
}
