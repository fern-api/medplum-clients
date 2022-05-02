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
  Optional<List<Reference>> interpreter();

  Optional<List<Annotation>> note();

  Optional<Id> id();

  Optional<Narrative> text();

  Optional<List<CodeableConcept>> reasonCode();

  Optional<String> description();

  Optional<List<ResourceList>> contained();

  Optional<Meta> meta();

  Optional<List<CodeableConcept>> procedureCode();

  Optional<List<Reference>> basedOn();

  Optional<Reference> location();

  Optional<UnsignedInt> numberOfSeries();

  Optional<ImagingstudyStatus> status();

  Optional<DateTime> started();

  Optional<List<ImagingStudy_Series>> series();

  Optional<List<Reference>> endpoint();

  Optional<List<Reference>> reasonReference();

  Optional<Code> language();

  Optional<List<Extension>> extension();

  Optional<Reference> encounter();

  Optional<UnsignedInt> numberOfInstances();

  String resourceType();

  Optional<List<Identifier>> identifier();

  Optional<Reference> referrer();

  Optional<Uri> implicitRules();

  Reference subject();

  Optional<List<Coding>> modality();

  Optional<Reference> procedureReference();

  Optional<List<Extension>> modifierExtension();

  static ImmutableImagingStudy.ResourceTypeBuildStage builder() {
    return ImmutableImagingStudy.builder();
  }
}
