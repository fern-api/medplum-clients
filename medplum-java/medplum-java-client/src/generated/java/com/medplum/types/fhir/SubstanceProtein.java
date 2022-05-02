package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.medplum.StagedBuilderStyle;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableSubstanceProtein.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface SubstanceProtein {
  Optional<List<Extension>> modifierExtension();

  Optional<Code> language();

  Optional<List<SubstanceProtein_Subunit>> subunit();

  String resourceType();

  Optional<List<ResourceList>> contained();

  Optional<Id> id();

  Optional<Narrative> text();

  Optional<List<String>> disulfideLinkage();

  Optional<Integer> numberOfSubunits();

  Optional<Uri> implicitRules();

  Optional<List<Extension>> extension();

  Optional<CodeableConcept> sequenceType();

  Optional<Meta> meta();

  static ImmutableSubstanceProtein.ResourceTypeBuildStage builder() {
    return ImmutableSubstanceProtein.builder();
  }
}
