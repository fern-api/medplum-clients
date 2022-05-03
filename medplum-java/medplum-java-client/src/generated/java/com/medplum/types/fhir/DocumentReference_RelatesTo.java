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
    as = ImmutableDocumentReference_RelatesTo.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface DocumentReference_RelatesTo {
  Optional<List<Extension>> modifierExtension();

  Optional<Documentreference_relatestoCode> code();

  Optional<List<Extension>> extension();

  Optional<String> id();

  Reference target();

  static ImmutableDocumentReference_RelatesTo.TargetBuildStage builder() {
    return ImmutableDocumentReference_RelatesTo.builder();
  }
}
