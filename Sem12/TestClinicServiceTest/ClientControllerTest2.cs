using ClinicService.Controllers;
using ClinicService.Models;
using ClinicService.Models.Requests;
using ClinicService.Services;
using Microsoft.AspNetCore.Mvc;
using Moq;
using NUnit.Framework;
using System;
using System.Collections.Generic;

namespace ClinicServiceTests
{
    [TestFixture]
    public class ClientControllerTests
    {
        private ClientController _clientController;
        private Mock<IClientRepository> _mockClientRepository;

        [SetUp]
        public void Setup()
        {
            _mockClientRepository = new Mock<IClientRepository>();
            _clientController = new ClientController(_mockClientRepository.Object);
        }

        [Test]
        public void GetAllClientsTest()
        {
            // [1] Подготовка данных для тестирования
            List<Client> clientsList = new List<Client>
            {
                new Client(),
                new Client(),
                new Client()
            };

            _mockClientRepository.Setup(repository =>
                repository.GetAll()).Returns(clientsList);

            // [2] Исполнение тестируемого метода
            var operationResult = _clientController.GetAll();

            // [3] Подготовка эталонного результата, проверка результата
            Assert.IsInstanceOf<OkObjectResult>(operationResult.Result);
            var okObjectResult = (OkObjectResult)operationResult.Result;
            Assert.IsInstanceOf<List<Client>>(okObjectResult.Value);

            _mockClientRepository.Verify(repository =>
                repository.GetAll(), Times.AtLeastOnce);
        }

        public static object[][] CorrectCreateClientData =
        {
            new object[] { new DateTime(1986, 1, 22), "AA1 B11222", "Иванов1", "Станислав1", "Андреевич1" },
            new object[] { new DateTime(1986, 1, 22), "AA1 B11222", "Иванов2", "Станислав2", "Андреевич2" },
            //new object[] { new DateTime(2013, 1, 22), "AA1 B11222", "Иванов3", "Станислав3", "Андреевич3" },
            new object[] { new DateTime(1986, 1, 22), "AA1 B11222", "Иванов4", "Станислав4", "Андреевич4" },
            new object[] { new DateTime(1986, 1, 22), "AA1 B11222", "Иванов5", "Станислав5", "Андреевич5" },
            //new object[] { new DateTime(1986, 1, 22), "AA1 B11222", "Иванов", "", "Андреевич" },
            new object[] { new DateTime(1986, 1, 22), "AA1 B11222", "Иванов6", "Станислав6", "Андреевич6" },
            new object[] { new DateTime(1986, 1, 22), "AA1 B11222", "Иванов7", "Станислав7", "Андреевич7" },
            new object[] { new DateTime(1986, 1, 22), "AA1 B11222", "Иванов8", "Станислав8", "Андреевич8" },
        };

        [Test]
        [TestCaseSource(nameof(CorrectCreateClientData))]
        public void CreateClientTest(
            DateTime birthday, string document, string surName, string firstName, string patronymic)
        {
            // [1] Подготовка данных для тестирования
            CreateClientRequest createClientRequest = new CreateClientRequest
            {
                Birthday = birthday,
                Document = document,
                SurName = surName,
                FirstName = firstName,
                Patronymic = patronymic
            };

            _mockClientRepository.Setup(repository =>
                repository.Create(It.IsNotNull<Client>())).Returns(1).Verifiable();

            // [2] Исполнение тестируемого метода
            var operationResult = _clientController.Create(createClientRequest);

            // [3] Подготовка эталонного результата, проверка результата
            Assert.IsInstanceOf<OkObjectResult>(operationResult.Result);
            var okObjectResult = (OkObjectResult)operationResult.Result;
            Assert.IsInstanceOf<int>(okObjectResult.Value);
            _mockClientRepository.Verify(repository =>
                repository.Create(It.IsNotNull<Client>()), Times.AtLeastOnce);
        }
    }
}
