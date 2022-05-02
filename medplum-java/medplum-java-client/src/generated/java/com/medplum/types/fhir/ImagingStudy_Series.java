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
    as = ImmutableImagingStudy_Series.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface ImagingStudy_Series {
  Optional<Id> uid();

  Optional<String> description();

  Optional<Coding> laterality();

  Optional<DateTime> started();

  Optional<UnsignedInt> numberOfInstances();

  Optional<Coding> bodySite();

  Coding modality();

  Optional<UnsignedInt> number();

  Optional<List<Extension>> extension();

  Optional<List<ImagingStudy_Performer>> performer();

  Optional<List<Reference>> endpoint();

  Optional<List<Extension>> modifierExtension();

  Optional<String> id();

  Optional<List<Reference>> specimen();

  Optional<List<ImagingStudy_Instance>> instance();

  static ImmutableImagingStudy_Series.ModalityBuildStage builder() {
    return ImmutableImagingStudy_Series.builder();
  }
}
