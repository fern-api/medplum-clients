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
  Optional<List<ImagingStudy_Performer>> performer();

  Optional<List<Reference>> endpoint();

  Optional<Id> uid();

  Optional<DateTime> started();

  Optional<List<Reference>> specimen();

  Optional<List<Extension>> modifierExtension();

  Optional<UnsignedInt> numberOfInstances();

  Optional<Coding> bodySite();

  Optional<List<ImagingStudy_Instance>> instance();

  Optional<String> id();

  Optional<String> description();

  Optional<Coding> laterality();

  Optional<List<Extension>> extension();

  Optional<UnsignedInt> number();

  Coding modality();

  static ImmutableImagingStudy_Series.ModalityBuildStage builder() {
    return ImmutableImagingStudy_Series.builder();
  }
}
