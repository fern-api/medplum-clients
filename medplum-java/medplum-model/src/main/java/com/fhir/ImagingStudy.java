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
    as = ImmutableImagingStudy.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface ImagingStudy {
  Optional<ImagingstudyStatus> status();

  Reference subject();

  Optional<Narrative> text();

  String resourceType();

  Optional<List<Coding>> modality();

  Optional<List<Annotation>> note();

  Optional<List<Reference>> reasonReference();

  Optional<unsignedInt> numberOfSeries();

  Optional<List<CodeableConcept>> procedureCode();

  Optional<Meta> meta();

  Optional<List<ResourceList>> contained();

  Optional<List<Identifier>> identifier();

  Optional<uri> implicitRules();

  Optional<unsignedInt> numberOfInstances();

  Optional<code> language();

  Optional<List<CodeableConcept>> reasonCode();

  Optional<List<Reference>> endpoint();

  Optional<Reference> referrer();

  Optional<Reference> procedureReference();

  Optional<dateTime> started();

  Optional<List<Reference>> basedOn();

  Optional<List<Extension>> modifierExtension();

  Optional<String> description();

  Optional<List<Reference>> interpreter();

  Optional<Reference> encounter();

  Optional<id> id();

  Optional<List<ImagingStudy_Series>> series();

  Optional<Reference> location();

  Optional<List<Extension>> extension();

  static ImmutableImagingStudy.SubjectBuildStage builder() {
    return ImmutableImagingStudy.builder();
  }
}
