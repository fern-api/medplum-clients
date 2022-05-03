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

  Optional<DateTime> started();

  Optional<List<ImagingStudy_Series>> series();

  Optional<Reference> procedureReference();

  Optional<Meta> meta();

  Optional<List<Reference>> basedOn();

  Optional<Id> id();

  Optional<List<Identifier>> identifier();

  Optional<Reference> encounter();

  Optional<Narrative> text();

  Optional<List<CodeableConcept>> procedureCode();

  Optional<UnsignedInt> numberOfSeries();

  Optional<UnsignedInt> numberOfInstances();

  Optional<Uri> implicitRules();

  Optional<List<Extension>> extension();

  Optional<List<Reference>> interpreter();

  String resourceType();

  Reference subject();

  Optional<List<Annotation>> note();

  Optional<List<CodeableConcept>> reasonCode();

  Optional<List<Coding>> modality();

  Optional<Reference> referrer();

  Optional<List<Reference>> endpoint();

  Optional<Code> language();

  Optional<ImagingstudyStatus> status();

  Optional<String> description();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Reference>> reasonReference();

  Optional<List<ResourceList>> contained();

  static ImmutableImagingStudy.ResourceTypeBuildStage builder() {
    return ImmutableImagingStudy.builder();
  }
}
