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
    as = ImmutableImagingStudy.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface ImagingStudy {
  Optional<Reference> location();

  Optional<Id> id();

  Optional<List<Coding>> modality();

  Optional<List<Reference>> endpoint();

  Optional<List<Reference>> basedOn();

  Optional<List<Extension>> modifierExtension();

  Optional<UnsignedInt> numberOfInstances();

  Reference subject();

  Optional<List<Reference>> reasonReference();

  Optional<List<CodeableConcept>> reasonCode();

  Optional<List<ResourceList>> contained();

  Optional<DateTime> started();

  Optional<List<Annotation>> note();

  Optional<Code> language();

  Optional<List<Identifier>> identifier();

  Optional<Meta> meta();

  Optional<ImagingstudyStatus> status();

  String resourceType();

  Optional<List<CodeableConcept>> procedureCode();

  Optional<List<Extension>> extension();

  Optional<String> description();

  Optional<List<ImagingStudy_Series>> series();

  Optional<List<Reference>> interpreter();

  Optional<Uri> implicitRules();

  Optional<Reference> encounter();

  Optional<Reference> referrer();

  Optional<UnsignedInt> numberOfSeries();

  Optional<Narrative> text();

  Optional<Reference> procedureReference();

  static ImmutableImagingStudy.SubjectBuildStage builder() {
    return ImmutableImagingStudy.builder();
  }
}
