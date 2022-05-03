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
  Optional<String> id();

  Optional<Coding> laterality();

  Optional<DateTime> started();

  Optional<List<Extension>> extension();

  Optional<List<Reference>> endpoint();

  Optional<UnsignedInt> number();

  Coding modality();

  Optional<String> description();

  Optional<Coding> bodySite();

  Optional<List<ImagingStudy_Performer>> performer();

  Optional<Id> uid();

  Optional<UnsignedInt> numberOfInstances();

  Optional<List<ImagingStudy_Instance>> instance();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Reference>> specimen();

  static ImmutableImagingStudy_Series.ModalityBuildStage builder() {
    return ImmutableImagingStudy_Series.builder();
  }
}
