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
  Optional<List<Reference>> endpoint();

  Optional<List<Reference>> interpreter();

  Optional<List<Annotation>> note();

  Optional<Uri> implicitRules();

  Optional<Narrative> text();

  Optional<DateTime> started();

  Optional<List<Reference>> reasonReference();

  Optional<List<CodeableConcept>> procedureCode();

  Optional<List<ImagingStudy_Series>> series();

  Optional<Meta> meta();

  Optional<List<ResourceList>> contained();

  Optional<Reference> referrer();

  Optional<Reference> location();

  Optional<String> description();

  Optional<List<Extension>> modifierExtension();

  Optional<ImagingstudyStatus> status();

  Optional<Reference> procedureReference();

  Optional<Reference> encounter();

  Optional<List<Reference>> basedOn();

  Optional<Code> language();

  Optional<List<Coding>> modality();

  Optional<List<CodeableConcept>> reasonCode();

  Optional<UnsignedInt> numberOfInstances();

  String resourceType();

  Optional<List<Identifier>> identifier();

  Optional<List<Extension>> extension();

  Optional<Id> id();

  Reference subject();

  Optional<UnsignedInt> numberOfSeries();

  static ImmutableImagingStudy.ResourceTypeBuildStage builder() {
    return ImmutableImagingStudy.builder();
  }
}
