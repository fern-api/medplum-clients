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
    as = ImmutableMedicinalProductPharmaceutical.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface MedicinalProductPharmaceutical {
  Optional<Id> id();

  Optional<List<MedicinalProductPharmaceutical_Characteristics>> characteristics();

  String resourceType();

  Optional<List<Reference>> ingredient();

  Optional<List<Identifier>> identifier();

  CodeableConcept administrableDoseForm();

  Optional<List<Extension>> modifierExtension();

  Optional<List<ResourceList>> contained();

  Optional<List<Reference>> device();

  Optional<Code> language();

  Optional<CodeableConcept> unitOfPresentation();

  Optional<Meta> meta();

  Optional<Uri> implicitRules();

  Optional<List<Extension>> extension();

  Optional<Narrative> text();

  List<MedicinalProductPharmaceutical_RouteOfAdministration> routeOfAdministration();

  static ImmutableMedicinalProductPharmaceutical.ResourceTypeBuildStage builder() {
    return ImmutableMedicinalProductPharmaceutical.builder();
  }
}
