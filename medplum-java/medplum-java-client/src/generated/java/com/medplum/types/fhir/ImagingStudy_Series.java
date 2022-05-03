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
  Optional<List<Extension>> extension();

  Optional<Coding> bodySite();

  Optional<List<Extension>> modifierExtension();

  Optional<UnsignedInt> numberOfInstances();

  Optional<List<Reference>> endpoint();

  Optional<List<ImagingStudy_Instance>> instance();

  Optional<String> description();

  Optional<DateTime> started();

  Optional<Id> uid();

  Optional<String> id();

  Optional<UnsignedInt> number();

  Optional<List<Reference>> specimen();

  Optional<List<ImagingStudy_Performer>> performer();

  Coding modality();

  Optional<Coding> laterality();

  static ImmutableImagingStudy_Series.ModalityBuildStage builder() {
    return ImmutableImagingStudy_Series.builder();
  }
}
