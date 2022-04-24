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
    as = ImmutableDocumentReference_RelatesTo.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface DocumentReference_RelatesTo {
  Optional<List<Extension>> extension();

  Optional<List<Extension>> modifierExtension();

  Optional<Documentreference_relatestoCode> code();

  Optional<String> id();

  Reference target();

  static ImmutableDocumentReference_RelatesTo.TargetBuildStage builder() {
    return ImmutableDocumentReference_RelatesTo.builder();
  }
}
