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
  Optional<Code> language();

  List<MedicinalProductPharmaceutical_RouteOfAdministration> routeOfAdministration();

  Optional<List<MedicinalProductPharmaceutical_Characteristics>> characteristics();

  Optional<Meta> meta();

  Optional<List<Reference>> device();

  Optional<CodeableConcept> unitOfPresentation();

  Optional<Id> id();

  CodeableConcept administrableDoseForm();

  Optional<List<Extension>> extension();

  Optional<Narrative> text();

  Optional<List<Reference>> ingredient();

  Optional<List<ResourceList>> contained();

  String resourceType();

  Optional<Uri> implicitRules();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Identifier>> identifier();

  static ImmutableMedicinalProductPharmaceutical.AdministrableDoseFormBuildStage builder() {
    return ImmutableMedicinalProductPharmaceutical.builder();
  }
}
